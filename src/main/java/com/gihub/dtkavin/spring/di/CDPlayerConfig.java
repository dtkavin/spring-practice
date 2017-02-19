package com.gihub.dtkavin.spring.di;

import com.github.dtkavin.learn.spring.beans.Drive;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by john on 17-2-12.
 */
@Configuration
//@ComponentScan
//@ComponentScan(basePackages = {"com.gihub.dtkavin.spring.di"})
@ComponentScan(basePackageClasses = {CDPlayer.class, Drive.class})
public class CDPlayerConfig {
}
