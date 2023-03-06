public class Cpu {
    int price;
    void add(int price){
        this.price=price;
    }
    public class Processor{
        int numCores;
        String manufacturer;
        void add(int numCores,String manufacturer){
            this.numCores=numCores;
            this.manufacturer=manufacturer;
        }
        public static class Ram{

            static int memory;
            static String ramManufacturer;
            void add(int memory, String ramManufacturer){
                Ram.memory =memory;
                Ram.ramManufacturer=ramManufacturer;
            }

        }

    }

    public static void main(String[] args) {
        Cpu cpu1=new Cpu();
        cpu1.add(1000);
        Cpu.Processor processor1=cpu1.new Processor();
        processor1.add(8,"Intel");
        Processor.Ram.memory=16;
        Processor.Ram.ramManufacturer="Corsair";
        System.out.println("CPU: "+processor1.manufacturer);
        System.out.println("CPU price: "+"Rs "+cpu1.price);
        System.out.println("Number of cores: "+processor1.numCores);
        System.out.println("RAM manufacturer: "+ Processor.Ram.ramManufacturer);
        System.out.println("RAM memory: "+ Processor.Ram.memory+" GB");
    }
}


