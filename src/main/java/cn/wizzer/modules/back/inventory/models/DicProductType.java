package cn.wizzer.modules.back.inventory.models;


import cn.wizzer.common.base.Model;
import org.nutz.dao.entity.annotation.*;

import java.io.Serializable;

@Table("dic_product_type")
public class DicProductType extends Model implements Serializable {

	@Name
	@Prev(els = {@EL("uuid()")})
	private String id;

	@Column
	@Comment("编码")
	@ColDefine(type = ColType.VARCHAR,width = 32)
	private String code;

	@Column
	@Comment("名称")
	@ColDefine(type = ColType.VARCHAR,width = 32)
	private String name;
	@Column
	private Integer used;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setCode(String code) {
		this.code = code;
	}
	 
	public String getCode() {
		return this.code;
	}

	public void setName(String name) {
		this.name = name;
	}
	 
	public String getName() {
		return this.name;
	}

	public Integer getUsed() {
		return used;
	}

	public void setUsed(Integer used) {
		this.used = used;
	}


}
