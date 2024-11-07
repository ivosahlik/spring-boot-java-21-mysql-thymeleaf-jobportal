package cz.ivosahlik.jobportal.util;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import static java.nio.file.StandardCopyOption.*;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class FileUploadUtil {

    public static void saveFile(String uploadDir, String filename, MultipartFile multipartFile) throws IOException {

        Path uploadPath = Paths.get(uploadDir);
        if (!Files.exists(uploadPath)) {
            Files.createDirectories(uploadPath);
        }

        try (InputStream inputStream = multipartFile.getInputStream()) {
            Path path = uploadPath.resolve(filename);
            Files.copy(inputStream, path, REPLACE_EXISTING);
        }
        catch (IOException ioe) {
            throw new IOException("Could not save image file: " + filename, ioe);
        }
    }
}
