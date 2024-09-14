class Student {
    int roll;
    String name;
    double marks;
}

class Array {
    public static void main(String args[]) {
        int nums1[] = {3, 7, 2, 4};
        nums1[1] = 6;
        System.out.println(nums1[1]);

        int nums2[] = new int[4];
        nums2[0] = 4;
        nums2[1] = 8;
        nums2[2] = 5;
        nums2[3] = 10;
        for (int i = 0; i < nums2.length; i++) {
            System.out.println(nums2[i]);
        }


        int nums3[][] = new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                nums3[i][j] = (int) (Math.random() * 10);
                System.out.print(nums3[i][j] + " ");
            }
            System.out.println();
        }
        for (int arr[] : nums3) {
            for (int n : arr) {
                System.out.print(n + " ");
            }
            System.out.println();
        }

        int nums4[][] = new int[3][];   // Jagged Array
        nums4[0] = new int[3];
        nums4[1] = new int[4];
        nums4[2] = new int[2];
        for (int i = 0; i < nums4.length; i++) {
            for (int j = 0; j < nums4[i].length; j++) {
                nums4[i][j] = (int) (Math.random() * 10);
                System.out.print(nums4[i][j] + " ");
            }
            System.out.println();
        }
        for (int arr[] : nums4) {
            for (int n : arr) {
                System.out.print(n + " ");
            }
            System.out.println();
        }

        Student stud1 = new Student();
        stud1.roll = 1;
        stud1.name = "Sam";
        stud1.marks = 39.45;
        
        Student stud2 = new Student();
        stud2.roll = 2;
        stud2.name = "Mike";
        stud2.marks = 99.45;
        
        Student stud3 = new Student();
        stud3.roll = 3;
        stud3.name = "Rex";
        stud3.marks = 73.25;
        
        Student students[] = new Student[3];    // Array of student references
        students[0] = stud1;
        students[1] = stud2;
        students[2] = stud3;

        for (Student stud : students) {
            System.out.println(stud.roll + " " + stud.name + " " + stud.marks);
        }
    }
}