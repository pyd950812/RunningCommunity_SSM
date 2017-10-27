package com.pengyd.controller;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;


//在springmvc中实现ajax上传文件
@RequestMapping("AjaxUploadController")
@Controller
public class AjaxUploadController {

	//@RequestParam  file的name
	@RequestMapping(value="test",method=RequestMethod.POST)
	public void test(@RequestParam(value="myfile",required=false) CommonsMultipartFile file, HttpServletRequest request) throws Exception {
		System.out.println(file);
		if (file.isEmpty()) {
			String path="E:/newEclipseWorkSpace/RunningCommunity_SSM/WebContent/upload/"+file.getOriginalFilename();
			String filename=file.getOriginalFilename();
			File file1=new File(path, filename);
			file.getFileItem().write(file1);//写入到文件夹中
			System.out.println("200");
		}else {
			System.out.println("!!!!!!!!!!!!!!");
		}
		
		
	}
	
	
	
	
	
	
	/*
	 * 
	 * @RequestMapping(value="test",method=RequestMethod.POST)
	@ResponseBody
	public String test(@RequestParam(value="myfile",required=false) MultipartFile[] files, HttpServletRequest request) throws Exception {
		if (files != null && files.length > 0) {
			for (MultipartFile file : files) {
				System.out.println(file);
				saveFile(request, file);
			}
		}
		//这里要解决中文乱码问题
		return new String("上传成功".getBytes("utf-8"),"iso-8859-1");
	}

	private void saveFile(HttpServletRequest request, MultipartFile file) {
		if (!file.isEmpty()) {
			try {
				String filePath = request.getServletContext().getRealPath("/") + "upload/"+ file.getOriginalFilename();
				//String path="E:/newEclipseWorkSpace/RunningCommunity_SSM/WebContent/upload/"+file.getOriginalFilename();
				File newFile = new File(filePath);
				if (!newFile.getParentFile().exists()){
					newFile.getParentFile().mkdirs();
				}

				file.transferTo(newFile);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	*/
}
