package cz.ivosahlik.jobportal.util;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileDownloadUtil {

    private Path foundfile;

    public Resource getFileAsResourse(String downloadDir, String fileName) throws IOException {
        Path path = Paths.get(downloadDir);
        Stream.of(path)
                .forEach(file -> {
                    if (file.getFileName().toString().startsWith(fileName)) {
                        foundfile = file;
                    }
                });

        if (foundfile == null) {
            return null;
        }
        return new UrlResource(foundfile.toUri());
    }
}
