public class DoubleLinkedLists12 {
    Node12 head;
    Node12 tail;
    int size;

    public DoubleLinkedLists12() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa12 data) {
        Node12 newNode = new Node12(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(Mahasiswa12 data) {
        Node12 newNode = new Node12(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void insertAfter(String keyNim, Mahasiswa12 data) {
        Node12 current = head;

        // Cari node dengan nim = keyNim
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        Node12 newNode = new Node12(data);

        // Jika current adalah tail, cukup tambahkan diakhir
        if (current == tail) {
            current.next = newNode;
            newNode.prev = current;
            tail = newNode;
        } else {
            // Sisipkan di tengah
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }

        size++;

        System.out.println("Node berhasil disisipkan setelah NIM " + keyNim);
    }

    public void add(int index, Mahasiswa12 data) {
        if (index < 0) {
            System.out.println("Indeks tidak valid.");
            return;
        }
        if (index == 0) {
            addFirst(data);
            return;
        }
        if (index >= size) {
            addLast(data);
            return;
        }
    
        Node12 current = head;
        int currentIndex = 0;
        while (current != null && currentIndex < index) {
            current = current.next;
            currentIndex++;
        }
    
        Node12 newNode = new Node12(data);
    
        newNode.prev = current.prev;
        newNode.next = current;
    
        if (current.prev != null) {
            current.prev.next = newNode;
        }
        current.prev = newNode;
    
        size++;
        System.out.println("Data berhasil ditambahkan di indeks " + index);
    }    

    public void print() {
        if (isEmpty()) {
            System.out.println("List masih kosong.");
            return;
        }
        Node12 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus.");
            return;
        }
        if (head == tail) {
            System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah : ");
            head.data.tampil();
            head = tail = null;
        } else {
            System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah : ");
            head.data.tampil();
            head = head.next;
            head.prev = null;
        }

        size--;
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus.");
            return;
        }
        if (head == tail) {
            System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah : ");
            tail.data.tampil();
            head = tail = null;
        } else {
            System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah : ");
            tail.data.tampil();
            tail = tail.prev;
            tail.next = null;
        }

        size--;
    }

    public void removeAfter(String keyNim) {
        Node12 current = head;

        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan.");
        } else if (current.next == null) {
            System.out.println("Tidak ada node setelah NIM " + keyNim + " yang bisa dihapus.");
        } else {
            Node12 toDelete = current.next;
            System.out.println("Data setelah " + keyNim + " berhasil dihapus:");
            toDelete.data.tampil();

            current.next = toDelete.next;
            if (toDelete.next != null) {
                toDelete.next.prev = current;
            } else {
                tail = current;
            }
            toDelete.next = toDelete.prev = null;
            size--;
        }
    }

    public void remove(int index) {
        if (index < 0 || isEmpty()) {
            System.out.println("Indeks tidak valid atau list kosong.");
            return;
        }
    
        if (index == 0) {
            removeFirst();
            return;
        }
    
        Node12 current = head;
        int currentIndex = 0;
    
        while (current != null && currentIndex < index) {
            current = current.next;
            currentIndex++;
        }
    
        if (current == null) {
            System.out.println("Indeks di luar batas.");
        } else {
            System.out.println("Data pada indeks " + index + " berhasil dihapus:");
            current.data.tampil();
    
            if (current == tail) {
                removeLast();
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
    
                current.next = current.prev = null;
                size--;
            }
        }
    }    

    public Node12 search(String nim) {
        Node12 current = head;
        while (current != null) {
            if (current.data.nim.equals(nim)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void getFirst() {
        if (isEmpty()) {
            System.out.println("List kosong.");
        } else {
            System.out.println("Data pada node pertama:");
            head.data.tampil();
        }
    }

    public void getLast() {
        if (isEmpty()) {
            System.out.println("List kosong.");
        } else {
            System.out.println("Data pada node terakhir:");
            tail.data.tampil();
        }
    }

    public void getIndex(int index) {
        if (isEmpty()) {
            System.out.println("List kosong.");
            return;
        }

        Node12 current = head;
        int currentIndex = 0;

        while (current != null && currentIndex < index) {
            current = current.next;
            currentIndex++;
        }

        if (current == null) {
            System.out.println("Indeks di luar batas.");
        } else {
            System.out.println("Data pada indeks ke-" + index + ":");
            current.data.tampil();
        }
    }

    public int size() {
        return size;
    }
}