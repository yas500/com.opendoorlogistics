package com.opendoorlogistics.core.scripts.execution.adapters.vls;

import com.opendoorlogistics.core.tables.beans.BeanMappedRowImpl;
import com.opendoorlogistics.core.tables.beans.annotations.ODLColumnOrder;
import com.opendoorlogistics.core.tables.beans.annotations.ODLDefaultLongValue;
import com.opendoorlogistics.core.tables.beans.annotations.ODLNullAllowed;
import com.opendoorlogistics.core.tables.beans.annotations.ODLTableName;

@ODLTableName(View.TABLE_NAME)
public class View extends BeanMappedRowImpl{
	public static final String TABLE_NAME = "Views";
	private String id;
	private String backgroundViewIds;
	private String activeViewId;
	private String foregroundViewId;
	private long dflt;
	
	public String getId() {
		return id;
	}

	@ODLColumnOrder(0)
	public void setId(String id) {
		this.id = id;
	}

	public String getBackgroundViewIds() {
		return backgroundViewIds;
	}

	@ODLNullAllowed
	@ODLColumnOrder(2)
	public void setBackgroundViewIds(String backgroundViewIds) {
		this.backgroundViewIds = backgroundViewIds;
	}

	public String getActiveViewId() {
		return activeViewId;
	}

	@ODLNullAllowed
	@ODLColumnOrder(3)
	public void setActiveViewId(String activeViewId) {
		this.activeViewId = activeViewId;
	}

	public String getForegroundViewId() {
		return foregroundViewId;
	}

	@ODLNullAllowed
	@ODLColumnOrder(4)
	public void setForegroundViewId(String foregroundViewId) {
		this.foregroundViewId = foregroundViewId;
	}

	public long getIsDefault() {
		return dflt;
	}

	@ODLNullAllowed
	@ODLColumnOrder(5)
	@ODLDefaultLongValue(0)
	public void setIsDefault(long dflt) {
		this.dflt = dflt;
	}


	
}