package common;

import android.net.Uri;
import android.os.Environment;

import com.jph.takephoto.app.TakePhoto;

import java.io.File;
import java.io.IOException;


/**
 * - 支持通过相机拍照获取图片
 * - 支持从相册选择图片
 * - 支持从文件选择图片
 * - 支持多图选择
 * - 支持批量图片裁切
 * - 支持批量图片压缩
 * - 支持对图片进行压缩
 * - 支持对图片进行裁剪
 * - 支持对裁剪及压缩参数自定义
 * - 提供自带裁剪工具(可选)
 * - 支持智能选取及裁剪异常处理
 * - 支持因拍照Activity被回收后的自动恢复
 * Author: DMN
 * Date: 2016/9/21 0007 20:10
 * Version:3.0.0
 */
public class CustomHelper {


    public static CustomHelper of() {
        return new CustomHelper();
    }

    private CustomHelper() {
        init();
    }

    private void init() {
    }

    public void onClick(String name, TakePhoto takePhoto) {
        File file = new File(Environment.getExternalStorageDirectory(), "/PMS照片/" + name + ".jpg");
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        } else {
            file.delete();
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        Uri imageUri = Uri.fromFile(file);
        takePhoto.onPickFromCapture(imageUri);
    }
}
