class HardDisk implements FileComponent {
    private String name;
    private String brand;
    private String path;
    private String FMS;
    private long size;

    public HardDisk(String name, String brand, String path, String FMS, long size) {
        this.name = name;
        this.brand = brand;
        this.path = path;
        this.FMS = FMS;
        this.size = size;
    }

    @Override
    public long getSize() {
        return size;
    }
}
