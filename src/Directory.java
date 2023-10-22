import java.util.ArrayList;
import java.util.List;

class Directory implements FileComponent {
    private int nbFiles;
    private List<FileComponent> children = new ArrayList<>();

    public Directory(int nbFiles) {
        this.nbFiles = nbFiles;
    }

    public void addComponent(FileComponent component) {
        children.add(component);
    }

    @Override
    public long getSize() {
        long totalSize = 0;
        for (FileComponent component : children) {
            totalSize += component.getSize();
        }
        return totalSize;
    }
}