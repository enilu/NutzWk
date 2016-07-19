package cn.wizzer.modules.back.inventory.models;


import cn.wizzer.common.base.Model;
import com.google.common.base.MoreObjects;
import org.nutz.dao.entity.annotation.*;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Comment("材料")
@Table("materials")
public class Materials extends Model implements Serializable {

	@Name
	@Prev(els = {@EL("uuid()")})
	private String id;

	@Column
	@Comment("编码")
	@ColDefine(type = ColType.VARCHAR,width = 32)
	@NotNull
	private String code;
	@Column
	@Comment("名称")
	@ColDefine(type = ColType.VARCHAR,width = 32)
	private String name;
	@Column
	@Comment("入库时间")
	@Prev(els = @EL("$me.now()"))
	@ColDefine(type = ColType.INT, width = 11)
	private Integer inDate;
	@Column
	@Comment("出库时间")
	@Prev(els = @EL("$me.now()"))
	@ColDefine(type = ColType.INT, width = 11)
	private Integer outDate;
	@Column
	@Comment("状态")
	@ColDefine(type = ColType.INT)
	private Integer materialStatus;
	@Column
	@Comment("国家")
	@ColDefine(type = ColType.VARCHAR,width = 32)
	private String country;
	@Column
	@Comment("生产车间")
	@ColDefine(type = ColType.VARCHAR,width = 128)
	private String workshop;
	@Column
	@Comment("产品列别")
	@ColDefine(type = ColType.VARCHAR,width = 32)
	private String productType;
	@Column
	@Comment("入库日期")
	@ColDefine(type = ColType.VARCHAR,width = 32)
	private String inDateStr;
	@Column
	@Comment("生产人员")
	@ColDefine(type = ColType.VARCHAR,width = 32)
	private String worker;
	@Column
	@Comment("仓位")
	@ColDefine(type = ColType.VARCHAR,width = 32)
	private String warehouse;

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

	public Integer getInDate() {
		return inDate;
	}

	public void setInDate(Integer inDate) {
		this.inDate = inDate;
	}

	public Integer getOutDate() {
		return outDate;
	}

	public void setOutDate(Integer outDate) {
		this.outDate = outDate;
	}

	public Integer getMaterialStatus() {
		return materialStatus;
	}

	public void setMaterialStatus(Integer materialStatus) {
		this.materialStatus = materialStatus;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getWorkshop() {
		return workshop;
	}

	public void setWorkshop(String workshop) {
		this.workshop = workshop;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getInDateStr() {
		return inDateStr;
	}

	public void setInDateStr(String inDateStr) {
		this.inDateStr = inDateStr;
	}

	public String getWorker() {
		return worker;
	}

	public void setWorker(String worker) {
		this.worker = worker;
	}

	public String getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(String warehouse) {
		this.warehouse = warehouse;
	}

	public void transferCodeToOther(String code){

//		String tmpCode = code;
//		DicDataService dicDataService = SpringUtil.getBean(DicDataService.class);
//
//		String countryCode = tmpCode.substring(0, 3);
//		DicCountry dicCountry = dicDataService.getEntity(DicCountry.class, countryCode);
//		this.country = dicCountry.getName();
//		tmpCode = code;
//		System.out.println(tmpCode.length());
//		String workshopCode = tmpCode.substring(3, 5);
//		DicWorkshop dicWorkshop = dicDataService.getEntity(DicWorkshop.class, workshopCode);
//		 this.workshop = dicWorkshop.getName();
//
//		String productTypeCode = tmpCode.substring(5,7);
//		DicProductType dicProductType = dicDataService.getEntity(DicProductType.class, productTypeCode);
//		this.productType = dicProductType.getName();
//
//		String workerCode = tmpCode.substring(7,10);
//		DicWorker dicWorker = dicDataService.getEntity(DicWorker.class,workerCode);
//		this.worker = dicWorker.getName();
//		this.inDateStr = tmpCode.substring(10,18);
//		String warehouseCode = tmpCode.substring(18,20);
//		DicWarehouse dicWarehouse = dicDataService.getEntity(DicWarehouse.class,warehouseCode);
//		this.warehouse = dicWarehouse.getName();
	}

}
