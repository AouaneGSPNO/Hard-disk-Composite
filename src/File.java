class File implements FileComponent {
    private String name;
    private long size;

    public File(String name, long size, String contenu) {
        this.name = name;
        this.size = size;
    }

    @Override
    public long getSize() {
        return size;
    }
}