package com.cnpiec.demo.controller;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cnpiec.demo.service.CopyFileService;


@Controller
public class CopyFileController {
    @Autowired
    private CopyFileService copyFileService;

    @RequestMapping("copyfile")
    @ResponseBody
    public String copyFile() throws IOException {

        try {
            List<Map<String, String>> list = copyFileService.getFilePath();
            for (Map<String, String> map : list) {
                String path = map.get("PATH");
                String issue = map.get("ISSUE");
                // System.out.println(path+"---"+issue);
                String FLA = path.split("_")[0];
                String year = issue.split("[.]")[0];
                String n = issue.replaceAll("[.]", "_");
                String name = FLA + "_" + n;
               // System.out.println(name);

                // 查询taskId
                List<String> taskIds = copyFileService.getTaskId(name);
                String taskId = taskIds.get(0);
                // 查询xml文件
                List<String> xmlNames = copyFileService.getXml(taskId);
                for (String fileName : xmlNames) {
                    String cpPath = "cp     /Sagedata/SAGE/" + FLA + "/" + year + "/" + name + "/" + "unzip" + "/"  +  fileName
                            + "    " + "/sagexml/incremental/2018-11-22";
                    System.out.println(cpPath);
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
        return "suc";
    }
}
