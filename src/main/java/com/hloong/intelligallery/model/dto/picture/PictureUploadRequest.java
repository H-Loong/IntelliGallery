package com.hloong.intelligallery.model.dto.picture;

import lombok.Data;

import java.io.Serializable;

@Data
public class PictureUploadRequest implements Serializable {

    private static final long serialVersionUID = 4662450996152554385L;

    private Long id;
}
