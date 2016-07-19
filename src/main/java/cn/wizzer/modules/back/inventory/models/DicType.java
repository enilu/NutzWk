package cn.wizzer.modules.back.inventory.models;


import cn.wizzer.common.base.Model;
import org.nutz.dao.entity.annotation.*;

import java.io.Serializable;

@Comment("基础字典")
@Table("dic_type")
public class DicType  extends Model implements Serializable {

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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
