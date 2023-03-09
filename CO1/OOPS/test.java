package OOPS;

import java.util.Scanner;

class CPU{
    int price;
    public class Processor{
        int cores;
        String promanu;
        public static class RAM{
            static int memory;
            static String rammanu;
            void add(int mre){
                memory = mre;
                System.out.println(memory);
            }
        }
    }
}

public class test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CPU cpu = new CPU();
        CPU.Processor processor = cpu.new Processor();
        System.out.println("Enter the No.of Cores, Manufacturer and price of the Processor:");
        processor.cores = sc.nextInt();
        processor.promanu = sc.next();
        cpu.price = sc.nextInt();
        CPU.Processor.RAM.rammanu = "Intel";
        System.out.println(CPU.Processor.RAM.rammanu);


    }
}

