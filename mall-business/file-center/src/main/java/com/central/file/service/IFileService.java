package com.central.file.service;

import java.util.Map;

import com.baomidou.mybatisplus.extension.service.IService;
import com.central.common.model.PageResult;
import org.springframework.web.multipart.MultipartFile;

import com.central.file.model.FileInfo;

/**
 * 文件service 目前仅支持阿里云oss,七牛云
 *
 * @author 作者 mallplus E-mail: 951449465@qq.com
*/
public interface IFileService extends IService<FileInfo> {
	FileInfo upload(MultipartFile file ) throws Exception;
	
	PageResult<FileInfo> findList(Map<String, Object> params);
}
