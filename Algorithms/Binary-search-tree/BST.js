class Node {
    constructor(data) {
        this.data = data
        this.next = null
    }
}

export default class Queue {
    constructor() {
        this.head = null
        this.tail = null
    }

    isEmpty() {
        return this.head == null
    }

    getPeek() {
        return this.head.data;
    }

    enqueue(newnode) {
        //let newnode = new Node(value)
        if (this.tail != null) {
            this.tail.next = newnode
        }
        this.tail = newnode

        if (this.head == null) {
            this.head = newnode
        }
    }

    dequeue() {
        let node = this.head
        this.head = this.head.next

        if (this.head == null) {
            this.tail = null
        }
        return node;
    }

    printQueue() {
        let current = this.head
        var result = ""
        while (current != null) {
            result += current.data + "->"
            //console.log(current.data + "->")
            current = current.next
        }
        console.log(result);
    }
}