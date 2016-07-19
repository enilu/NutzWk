package cn.wizzer.modules.back.inventory.models;


import cn.wizzer.common.base.Model;
import org.nutz.dao.entity.annotation.*;

import java.io.Serializable;

@Comment("基础字典数据")
@Table("dic_data")
public class DicData  extends Model implements Serializable {

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
	@ColDefine(type = ColType.VARCHAR,width = 32)
	private String typeId;

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

	public String getTypeId() {
		return typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}
}
