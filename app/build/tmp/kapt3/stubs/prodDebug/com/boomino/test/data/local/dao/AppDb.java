package com.boomino.test.data.local.dao;

import java.lang.System;

@androidx.room.Database(entities = {com.boomino.test.data.local.dto.ItemVideoRepositoryModel.class, com.boomino.test.data.local.dto.ItemCategoryRepositoryModel.class}, version = 1)
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/boomino/test/data/local/dao/AppDb;", "Landroidx/room/RoomDatabase;", "()V", "appDao", "Lcom/boomino/test/data/local/dao/AppDao;", "Companion", "app_prodDebug"})
public abstract class AppDb extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final com.boomino.test.data.local.dao.AppDb.Companion Companion = null;
    @kotlin.jvm.Volatile()
    private static volatile com.boomino.test.data.local.dao.AppDb INSTANCE;
    
    public AppDb() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.boomino.test.data.local.dao.AppDao appDao();
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/boomino/test/data/local/dao/AppDb$Companion;", "", "()V", "INSTANCE", "Lcom/boomino/test/data/local/dao/AppDb;", "getDatabase", "context", "Landroid/content/Context;", "app_prodDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.boomino.test.data.local.dao.AppDb getDatabase(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
    }
}