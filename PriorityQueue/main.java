import java.util.*;

class Ticket {
    String id;
    int severity;
    int arrival;

    Ticket(String id, int severity, int arrival) {
        this.id = id;
        this.severity = severity;
        this.arrival = arrival;
    }
}

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Ticket> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String id = sc.next();
            int severity = sc.nextInt();
            int arrival = sc.nextInt();
            list.add(new Ticket(id, severity, arrival));
        }

        PriorityQueue<Ticket> pq = new PriorityQueue<>(
            (a, b) -> {
                if (a.severity != b.severity) {
                    return b.severity - a.severity;   
                }
                return a.arrival - b.arrival;         
            }
        );

        pq.addAll(list);

        while (!pq.isEmpty()) {
            Ticket node = pq.poll();
            System.out.println(node.id + " " + node.severity + " " + node.arrival);
        }
    }
}