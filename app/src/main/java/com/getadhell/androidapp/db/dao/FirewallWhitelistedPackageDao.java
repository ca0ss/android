package com.getadhell.androidapp.db.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.getadhell.androidapp.db.entity.FirewallWhitelistedPackage;

import java.util.List;

@Dao
public interface FirewallWhitelistedPackageDao {

    @Query("SELECT * FROM FirewallWhitelistedPackage")
    List<FirewallWhitelistedPackage> getAll();

    @Insert
    void insertAll(List<FirewallWhitelistedPackage> firewallWhitelistedPackages);
}