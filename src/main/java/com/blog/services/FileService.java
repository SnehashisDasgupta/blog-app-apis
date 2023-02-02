package com.blog.services;

import org.springframework.web.multipart.MultipartFile;

import java.io.*;

public interface FileService {
    String uploadImage(String path, MultipartFile file) throws IOException;

    InputStream getResource(String path, String fileName) throws FileNotFoundException;
}
