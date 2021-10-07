package com.wucy.tianfu.demo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

/**
 * @author wucy
 * @date 2021/9/25
 * note
 */
public class DBquickGenerate {
    public static void main(String[] args) {
        FastAutoGenerator.create("jdbc:mysql://localhost:3306/tianfu", "root", "root")
                .globalConfig(builder -> {
                    builder.author("wucy") // 设置作者
                            .enableSwagger() // 开启 swagger 模式
//                            .fileOverride()// 覆盖已生成文件
                            .outputDir("D:\\ideaProjects\\tianfu\\src\\main\\java");
                })
                .packageConfig(builder -> {
                    builder.parent("com.wucy.tianfu") // 设置父包名
                            .entity("domain")
                            .controller("restapi")
                            .pathInfo(Collections.singletonMap(OutputFile.mapperXml, "D:\\ideaProjects\\tianfu\\src\\main\\resources\\mapper")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder // 设置需要生成的表名
                            .addTablePrefix("tf")// 设置过滤表前缀
                            //service
                            .serviceBuilder()
                            .formatServiceFileName("%sService")
                            .build()
                            //entity
                            .entityBuilder()
                            .idType(IdType.AUTO)//主键自增
                            .build()
                            //controller
                            .controllerBuilder()
                            .enableRestStyle()//开启restController
                            .build();

                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }
}
