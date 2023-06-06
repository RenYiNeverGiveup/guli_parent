package com.atguigu.eduservice.entity.vo;

import lombok.Data;

/**
 * @author Administrator
 */
@Data
public class CoursePublishVo {
    private String id;
    private String title;
    /**
     * 课程封面图片路径
     */
    private String cover;
    private Integer lessonNum;
    /**
     * 一级分类
     */
    private String subjectLevelOne;
    /**
     * 二级分类
     */
    private String subjectLevelTwo;
    private String teacherName;
    /**
     * 价格  只用于显示
     */
    private String price;
}
