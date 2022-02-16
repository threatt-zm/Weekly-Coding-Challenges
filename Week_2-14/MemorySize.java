//Zabian Threatt
//This program takes the memory size (ms is a string type) as an argument and returns the actual memory size.

public class MemorySize {
    public static void main(String[] args) {
        
        
        System.out.println(actualMemorySize("32GB")); //returns 32GB
        System.out.println(actualMemorySize("2GB")); //returns 1.86GB
        System.out.println(actualMemorySize("1GB")); //returns 930MB
        System.out.println(actualMemorySize("512MB")); //returns 476MB
        
    }

    public static String actualMemorySize(String memory){
        double size = Double.parseDouble(memory.substring(0, memory.length()-2));
        String storageType = memory.substring(memory.length()-2);

        double actualSize = size*.93;

        if(actualSize < 1 && storageType.equals("GB")){
            return (int)(actualSize*1000) + "MB";
        }
        else if(storageType.equals("MB")){
            return (int)actualSize + "MB";
        } else {
            return actualSize + "GB";
        }
    }
}