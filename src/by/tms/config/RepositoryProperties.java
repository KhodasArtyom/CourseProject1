package by.tms.config;

import java.nio.file.Path;

public class RepositoryProperties {

    private final Path fileDirectory;

    public RepositoryProperties(Path fileDirectory) {
        this.fileDirectory = fileDirectory;
        if(fileDirectory==null) {
            throw new NullPointerException();
        }
    }

    public Path getFileDirectory() {
        return fileDirectory;
    }
}
