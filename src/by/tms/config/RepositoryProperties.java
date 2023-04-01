package by.tms.config;

import java.nio.file.Path;
import java.util.Currency;

public class RepositoryProperties {

    private final Path fileDirectory;
    private final Currency isoCode;

    public RepositoryProperties(Path fileDirectory,Currency isoCode) {
        this.fileDirectory = fileDirectory;
        this.isoCode = isoCode;
        if(fileDirectory==null || isoCode == null) {
            throw new NullPointerException();
        }

    }
    public Path getFileDirectory() {
        return fileDirectory;
    }

    public Currency getIsoCode() {
        return isoCode;
    }
}
