package br.fbv.cryptosvault.core;

import java.io.File;

public class FileItem implements Comparable<FileItem> {

    private File    file;
    private boolean backToParent = false;
    private boolean selected     = false;

    public FileItem(File file, boolean backToParent, boolean selected) {
        this(file, backToParent);
        this.selected = selected;
    }

    public FileItem(File file, boolean backToParent) {
        super();
        this.file = file;
        this.backToParent = backToParent;
    }

    public FileItem(File file) {
        super();
        this.file = file;
    }

    public File getFile() {
        return file;
    }

    public boolean isBackToParent() {
        return backToParent;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    @Override
    public int compareTo(FileItem another) {
        return file.getName().compareTo(another.getFile().getName());
    }

}
