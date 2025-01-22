package com.hloong.intelligallery.service;

import com.hloong.intelligallery.model.domain.Picture;
import com.baomidou.mybatisplus.extension.service.IService;
import com.hloong.intelligallery.model.domain.User;
import com.hloong.intelligallery.model.dto.picture.PictureUploadRequest;
import com.hloong.intelligallery.model.vo.PictureVO;
import org.springframework.web.multipart.MultipartFile;

/**
* @author lenovo
* @description 针对表【picture(图片)】的数据库操作Service
* @createDate 2025-01-18 00:02:29
*/
public interface PictureService extends IService<Picture> {

    PictureVO uploadPicture(MultipartFile multipartFile, PictureUploadRequest pictureUploadRequest, User loginUser);

}
