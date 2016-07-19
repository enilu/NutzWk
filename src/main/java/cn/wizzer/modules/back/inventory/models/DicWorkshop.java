package cn.wizzer.modules.back.inventory.models;


import cn.wizzer.common.base.Model;
import org.nutz.dao.entity.annotation.*;

import java.io.Serializable;


@Comment("生产车间")
@Table("dic_workshop")
public class DicWorkshop extends Model implements Serializable {
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
	@ColDefine(type=ColType.INT)
	private Integer used;

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

	public Integer getUsed() {
		return used;
	}

	public void setUsed(Integer used) {
		this.used = used;
	}
}
