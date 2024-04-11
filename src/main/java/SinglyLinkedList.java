/**
 * @author Himal Shrestha
 * Course: CSC 229 Data Structures & Algorithims
 * Prof: Dr. Moaath Alrajab
 * Assignment: Lab 08
 * Desc:
 * The `SinglyLinkedList` class implements a custom linked list structure with functionality to add nodes,
 * filter out nodes containing the digit '3', and calculate the sum of the node values.
 */
// Define the SinglyLinkedList class.
public class SinglyLinkedList {
    // Declare the head node of the list.
    Node head;

    // Define a static inner class Node, which represents each element in the list.
    static class Node {
        // Data field to store the integer value of the node.
        int data;
        // Pointer to the next node in the list.
        Node next;

        // Constructor for creating a new Node with specified data and null next reference.
        Node(int d) {
            data = d; // Initialize the data field with the provided value.
            next = null; // Set the next node reference to null.
        }
    }

    // Method to add a new node with specified data to the end of the list.
    public void add(int data) {
        // Create a new Node instance with the given data.
        Node newNode = new Node(data);
        // Check if the list is empty by checking if head is null.
        if (head == null) {
            // If the list is empty, make the new node as the head of the list.
            head = newNode;
        } else {
            // If the list is not empty, iterate to the end of the list to add the new node.
            Node current = head;
            while (current.next != null) {
                // Traverse through the list until the last node is found.
                current = current.next;
            }
            // Set the next of the last node to the new node, effectively adding it to the end.
            current.next = newNode;
        }
    }

    // Method to filter out nodes that contain the digit '3' in their data, removing them from the current list and adding them to a new list.
    public SinglyLinkedList filterAndRemoveIfContains3() {
        // Create a new SinglyLinkedList to store nodes that contain '3'.
        SinglyLinkedList result = new SinglyLinkedList();
        // Start from the head of the current list.
        Node current = head, prev = null;
        while (current != null) {
            // Check if the current node's data contains the digit '3'.
            if (String.valueOf(current.data).contains("3")) {
                // If yes, add this data to the result list.
                result.add(current.data);
                // If the current node is not the head, adjust the previous node's next reference.
                if (prev != null) {
                    prev.next = current.next;
                } else {
                    // If the current node is the head, move the head to the next node.
                    head = current.next;
                }
            } else {
                // If the current node's data does not contain '3', set previous to current.
                prev = current;
            }
            // Move to the next node in the list.
            current = current.next;
        }
        // Return the list containing all nodes that had '3' in their data.
        return result;
    }

    // Method to calculate the sum of all data values in the list.
    public int sum() {
        // Initialize sum to 0.
        int sum = 0;
        // Start from the head of the list.
        Node current = head;
        while (current != null) {
            // Add the current node's data to sum.
            sum += current.data;
            // Move to the next node.
            current = current.next;
        }
        // Return the total sum of the data in the list.
        return sum;
    }
}
