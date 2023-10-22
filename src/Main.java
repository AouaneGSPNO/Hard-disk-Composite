public class Main {
    public static void main(String[] args) {
        File file1 = new File("f1.txt", 100, "Contenu du f1");
        File file2 = new File("f2.txt", 200, "Contenu du f2");

        HardDisk hardDisk = new HardDisk("HDn1", "Brandn1", "/path/to/HD", "123", 400);

        Directory directory = new Directory(2);
        directory.addComponent(file1);
        directory.addComponent(file2);
        directory.addComponent(hardDisk);

        long totalSize = directory.getSize();
        System.out.println("************  Taille totale ***************");
        System.out.println(" HD : " + hardDisk.getSize () + " bytes");
        System.out.println(" f1 : " + file1.getSize () + " bytes");
        System.out.println(" f2 : " + file2.getSize () + " bytes");
        System.out.println("Taille totale du répertoire : " + totalSize + " bytes");

    }
}