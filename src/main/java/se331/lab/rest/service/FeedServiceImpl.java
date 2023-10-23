package se331.lab.rest.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import se331.lab.rest.Repository.FeedRepository;
import se331.lab.rest.Entity.Feed;
import se331.lab.rest.Util.FileUtils;

import java.io.IOException;
import java.util.Optional;

@Service
public class FeedServiceImpl {

    @Autowired
    private FeedRepository repository;

    public String uploadImage(MultipartFile file) throws IOException {

        Feed imageData = repository.save(Feed.builder()
                .name(file.getOriginalFilename())
                .type(file.getContentType())
                .fileData(FileUtils.compressImage(file.getBytes())).build());
        if (imageData != null) {
            return "file uploaded successfully : " + file.getOriginalFilename();
        }
        return null;
    }

    public byte[] downloadImage(String fileName){
        Optional<Feed> dbImageData = repository.findByName(fileName);
        byte[] images=FileUtils.decompressImage(dbImageData.get().getFileData());
        return images;
    }
}
