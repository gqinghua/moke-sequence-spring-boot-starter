package com.moke.sequence.properties;

/**
 * @author lengleng
 * @date 2019-05-26
 */

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


/**
 * @author lengleng
 * @date 2019/5/26
 * <p>
 * 发号器DB配置属性
 */
@Data
@Component
@ConfigurationProperties(prefix = "moke.xsequence.db")
public class SequenceDbProperties extends BaseSequenceProperties {
	/**
	 * 表名称
	 */
	private String tableName;
	/**
	 * 重试次数
	 */
	private int retryTimes;

}