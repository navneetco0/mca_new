class TaskScheduling {

    public static void main(String[] args) {

        int[] job = {1, 5, 2, 10};
        int[] serviceTime = {3, 7, 4, 8};

        int n = job.length;

        // Sort jobs according to service time
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {

                if (serviceTime[i] > serviceTime[j]) {

                    int temp = serviceTime[i];
                    serviceTime[i] = serviceTime[j];
                    serviceTime[j] = temp;

                    temp = job[i];
                    job[i] = job[j];
                    job[j] = temp;
                }
            }
        }

        int completionTime = 0;
        int totalTime = 0;

        System.out.println("Job\tService Time\tCompletion Time");

        for (int i = 0; i < n; i++) {

            completionTime += serviceTime[i];
            totalTime += completionTime;

            System.out.println(job[i] + "\t"
                    + serviceTime[i] + "\t\t"
                    + completionTime);
        }

        double averageTime = (double) totalTime / n;

        System.out.println("\nOptimal Job Sequence:");

        for (int i = 0; i < n; i++) {
            System.out.print(job[i]);

            if (i < n - 1)
                System.out.print(" -> ");
        }

        System.out.println("\nTotal Time = " + totalTime);
        System.out.println("Average Time = " + averageTime);
    }
}