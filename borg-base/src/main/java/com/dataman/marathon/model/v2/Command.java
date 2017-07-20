package com.dataman.marathon.model.v2;


import com.dataman.util.ModelUtil;

/**@ClassName: Command
 * @Description: TODO(健康检查命令行对象) 
 * @author biancl 
 * @date 2017年6月23日 下午5:28:32 
 * @Copyright © 2017北京数人科技有限公司
 */
public class Command {
	private String value;

	/**
	 * value
	 *
	 * @return  the value
	 * @since   1.0.0
	*/
	
	public String getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return ModelUtil.toString(this);
	}
}
