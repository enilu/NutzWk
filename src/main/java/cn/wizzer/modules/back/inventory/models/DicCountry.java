package cn.wizzer.modules.back.inventory.models;

import org.nutz.dao.entity.annotation.*;
import cn.wizzer.common.base.Model;

import java.io.Serializable;

@Comment("国家")
@Table("dic_country")
public class DicCountry  extends Model implements Serializable {
	private static final long serialVersionUID = 1L;
	@Name
	@Prev(els = {@EL("uuid()")})
	private String id;
	
	@Column
	@Comment("编码")
	@ColDefine(type = ColType.VARCHAR)
	private String code;
	
	@Column
	@Comment("名称")
	@ColDefine(type = ColType.VARCHAR)

	private String name;
	
	public void setId(String id) {
		this.id = id;
	}
	 
	public String getId() {
		return this.id;
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


}
