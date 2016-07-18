package cn.wizzer.modules.back.inventory.controllers;

import cn.wizzer.common.annotation.SLog;
import cn.wizzer.common.base.Result;
import cn.wizzer.common.filter.PrivateFilter;
import cn.wizzer.common.page.DataTableColumn;
import cn.wizzer.common.page.DataTableOrder;
import cn.wizzer.modules.back.inventory.models.DicCountry;
import cn.wizzer.modules.back.inventory.services.DicCountryService;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.nutz.dao.Cnd;
import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.lang.Strings;
import org.nutz.log.Log;
import org.nutz.log.Logs;
import org.nutz.mvc.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@IocBean
@At("/private/inventory/dic_countries")
@Filters({@By(type = PrivateFilter.class)})
public class DicCountryController {
	private static final Log log = Logs.get();
	@Inject
	private DicCountryService dicCountryService;

	@At("")
	@Ok("beetl:/private/inventory/dic_countries/index.html")
	@RequiresAuthentication
	public void index() {

	}

	@At
	@Ok("json:full")
	@RequiresAuthentication
	public Object data(@Param("length") int length, @Param("start") int start, @Param("draw") int draw, @Param("::order") List<DataTableOrder> order, @Param("::columns") List<DataTableColumn> columns) {
		Cnd cnd = Cnd.NEW();
		Object result =  dicCountryService.data(length, start, draw, order, columns, cnd, null);
		return result;
    }

    @At
    @Ok("beetl:/private/inventory/dic_countries/add.html")
    @RequiresAuthentication
    public void add() {

    }

    @At
    @Ok("json")
    @SLog(tag = "新建记录", msg = "国家名称:${args[0].name}")
	@RequiresPermissions("sys.dicmgr.country.add")
    public Object addDo(@Param("..") DicCountry dicCountry, HttpServletRequest req) {
		try {
			dicCountryService.insert(dicCountry);
			return Result.success("system.success");
		} catch (Exception e) {
			return Result.error("system.error");
		}
    }

    @At("/edit/?")
    @Ok("beetl:/private/inventory/dic_countries/edit.html")
    @RequiresAuthentication
    public Object edit(String id) {
		return dicCountryService.fetch(id);
    }

    @At
    @Ok("json")
	@RequiresPermissions("sys.dicmgr.country.edit")
	@SLog(tag = "编辑国家号", msg = "国家名称:${args[0].name}")
    public Object editDo(@Param("..") DicCountry dicCountry, HttpServletRequest req) {
		try {

			dicCountry.setOpAt((int) (System.currentTimeMillis() / 1000));
			dicCountryService.updateIgnoreNull(dicCountry);
			return Result.success("system.success");
		} catch (Exception e) {
			return Result.error("system.error");
		}
    }


    @At({"/delete","/delete/?"})
    @Ok("json")
	@RequiresPermissions("sys.dicmgr.country.delete")
	@SLog(tag = "删除国家号", msg = "国家名称}")
    public Object delete(String id, @Param("ids") String[] ids ,HttpServletRequest req) {
		try {
			if(ids!=null&&ids.length>0){
				dicCountryService.delete(ids);
			}else{
				dicCountryService.delete(id);
			}
			return Result.success("system.success");
		} catch (Exception e) {
			return Result.error("system.error");
		}
    }


    @At("/detail/?")
    @Ok("beetl:/private/inventory/dic_countries/detail.html")
    @RequiresAuthentication
		public Object detail(String id) {
			if (!Strings.isBlank(id)) {
				return dicCountryService.fetch(id);

			}
		return null;
    }

}
