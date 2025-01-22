package com.hloong.intelligallery.controller;

import com.hloong.intelligallery.annotation.AuthCheck;
import com.hloong.intelligallery.common.BaseResponse;
import com.hloong.intelligallery.common.ResultUtils;
import com.hloong.intelligallery.constant.UserConstant;
import com.hloong.intelligallery.model.domain.User;
import com.hloong.intelligallery.model.dto.picture.PictureUploadRequest;
import com.hloong.intelligallery.model.vo.PictureVO;
import com.hloong.intelligallery.service.PictureService;
import com.hloong.intelligallery.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/picture")
public class PictureController {

    @Resource
    private UserService userService;

    @Resource
    private PictureService pictureService;
    /**
     * 上传图片（可重新上传）
     */
    @PostMapping("/upload")
    @AuthCheck(mustRole = UserConstant.ADMIN_ROLE)
    public BaseResponse<PictureVO> uploadPicture(
            @RequestPart("file") MultipartFile multipartFile,
            PictureUploadRequest pictureUploadRequest,
            HttpServletRequest request) {
        User loginUser = userService.getLoginUser(request);
        PictureVO pictureVO = pictureService.uploadPicture(multipartFile, pictureUploadRequest, loginUser);
        return ResultUtils.success(pictureVO);
    }

}
