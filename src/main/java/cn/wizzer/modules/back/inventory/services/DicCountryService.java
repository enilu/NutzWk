package cn.wizzer.modules.back.inventory.services;

import cn.wizzer.common.base.Service;
import cn.wizzer.modules.back.inventory.models.DicCountry;
import org.nutz.dao.Dao;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.log.Log;
import org.nutz.log.Logs;
@IocBean(args = {"refer:dao"})
public class DicCountryService extends Service<DicCountry> {
	private static final Log log = Logs.get();

    public DicCountryService(Dao dao) {
    	super(dao);
    }
}

