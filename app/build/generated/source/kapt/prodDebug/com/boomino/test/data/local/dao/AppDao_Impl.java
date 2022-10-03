package com.boomino.test.data.local.dao;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.boomino.test.data.local.dto.ItemCategoryRepositoryModel;
import com.boomino.test.data.local.dto.ItemVideoRepositoryModel;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDao_Impl implements AppDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ItemVideoRepositoryModel> __insertionAdapterOfItemVideoRepositoryModel;

  private final EntityInsertionAdapter<ItemCategoryRepositoryModel> __insertionAdapterOfItemCategoryRepositoryModel;

  public AppDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfItemVideoRepositoryModel = new EntityInsertionAdapter<ItemVideoRepositoryModel>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `video` (`id`,`title`,`big_poster`,`profilePhoto`,`username`,`visit_cnt`,`frame`) VALUES (?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ItemVideoRepositoryModel value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getBig_poster() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getBig_poster());
        }
        if (value.getProfilePhoto() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getProfilePhoto());
        }
        if (value.getUsername() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getUsername());
        }
        stmt.bindLong(6, value.getVisit_cnt());
        if (value.getFrame() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getFrame());
        }
      }
    };
    this.__insertionAdapterOfItemCategoryRepositoryModel = new EntityInsertionAdapter<ItemCategoryRepositoryModel>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `category` (`id`,`name`) VALUES (?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ItemCategoryRepositoryModel value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
      }
    };
  }

  @Override
  public Object saveCategorizedVideoRepositories(final List<ItemVideoRepositoryModel> videoList,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfItemVideoRepositoryModel.insert(videoList);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object saveCategoriesRepositories(final List<ItemCategoryRepositoryModel> categoryList,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfItemCategoryRepositoryModel.insert(categoryList);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Flow<List<ItemVideoRepositoryModel>> getCategorizedVideosRepositories() {
    final String _sql = "SELECT * FROM video";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"video"}, new Callable<List<ItemVideoRepositoryModel>>() {
      @Override
      public List<ItemVideoRepositoryModel> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfBigPoster = CursorUtil.getColumnIndexOrThrow(_cursor, "big_poster");
          final int _cursorIndexOfProfilePhoto = CursorUtil.getColumnIndexOrThrow(_cursor, "profilePhoto");
          final int _cursorIndexOfUsername = CursorUtil.getColumnIndexOrThrow(_cursor, "username");
          final int _cursorIndexOfVisitCnt = CursorUtil.getColumnIndexOrThrow(_cursor, "visit_cnt");
          final int _cursorIndexOfFrame = CursorUtil.getColumnIndexOrThrow(_cursor, "frame");
          final List<ItemVideoRepositoryModel> _result = new ArrayList<ItemVideoRepositoryModel>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final ItemVideoRepositoryModel _item;
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpBig_poster;
            if (_cursor.isNull(_cursorIndexOfBigPoster)) {
              _tmpBig_poster = null;
            } else {
              _tmpBig_poster = _cursor.getString(_cursorIndexOfBigPoster);
            }
            final String _tmpProfilePhoto;
            if (_cursor.isNull(_cursorIndexOfProfilePhoto)) {
              _tmpProfilePhoto = null;
            } else {
              _tmpProfilePhoto = _cursor.getString(_cursorIndexOfProfilePhoto);
            }
            final String _tmpUsername;
            if (_cursor.isNull(_cursorIndexOfUsername)) {
              _tmpUsername = null;
            } else {
              _tmpUsername = _cursor.getString(_cursorIndexOfUsername);
            }
            final int _tmpVisit_cnt;
            _tmpVisit_cnt = _cursor.getInt(_cursorIndexOfVisitCnt);
            final String _tmpFrame;
            if (_cursor.isNull(_cursorIndexOfFrame)) {
              _tmpFrame = null;
            } else {
              _tmpFrame = _cursor.getString(_cursorIndexOfFrame);
            }
            _item = new ItemVideoRepositoryModel(_tmpId,_tmpTitle,_tmpBig_poster,_tmpProfilePhoto,_tmpUsername,_tmpVisit_cnt,_tmpFrame);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<ItemVideoRepositoryModel>> getFilterCategorizedVideosRepositories(
      final String categoryId) {
    final String _sql = "SELECT * FROM video WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (categoryId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, categoryId);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[]{"video"}, new Callable<List<ItemVideoRepositoryModel>>() {
      @Override
      public List<ItemVideoRepositoryModel> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfBigPoster = CursorUtil.getColumnIndexOrThrow(_cursor, "big_poster");
          final int _cursorIndexOfProfilePhoto = CursorUtil.getColumnIndexOrThrow(_cursor, "profilePhoto");
          final int _cursorIndexOfUsername = CursorUtil.getColumnIndexOrThrow(_cursor, "username");
          final int _cursorIndexOfVisitCnt = CursorUtil.getColumnIndexOrThrow(_cursor, "visit_cnt");
          final int _cursorIndexOfFrame = CursorUtil.getColumnIndexOrThrow(_cursor, "frame");
          final List<ItemVideoRepositoryModel> _result = new ArrayList<ItemVideoRepositoryModel>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final ItemVideoRepositoryModel _item;
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpBig_poster;
            if (_cursor.isNull(_cursorIndexOfBigPoster)) {
              _tmpBig_poster = null;
            } else {
              _tmpBig_poster = _cursor.getString(_cursorIndexOfBigPoster);
            }
            final String _tmpProfilePhoto;
            if (_cursor.isNull(_cursorIndexOfProfilePhoto)) {
              _tmpProfilePhoto = null;
            } else {
              _tmpProfilePhoto = _cursor.getString(_cursorIndexOfProfilePhoto);
            }
            final String _tmpUsername;
            if (_cursor.isNull(_cursorIndexOfUsername)) {
              _tmpUsername = null;
            } else {
              _tmpUsername = _cursor.getString(_cursorIndexOfUsername);
            }
            final int _tmpVisit_cnt;
            _tmpVisit_cnt = _cursor.getInt(_cursorIndexOfVisitCnt);
            final String _tmpFrame;
            if (_cursor.isNull(_cursorIndexOfFrame)) {
              _tmpFrame = null;
            } else {
              _tmpFrame = _cursor.getString(_cursorIndexOfFrame);
            }
            _item = new ItemVideoRepositoryModel(_tmpId,_tmpTitle,_tmpBig_poster,_tmpProfilePhoto,_tmpUsername,_tmpVisit_cnt,_tmpFrame);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<ItemCategoryRepositoryModel>> getCategoriesRepositories() {
    final String _sql = "SELECT * FROM category";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"category"}, new Callable<List<ItemCategoryRepositoryModel>>() {
      @Override
      public List<ItemCategoryRepositoryModel> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final List<ItemCategoryRepositoryModel> _result = new ArrayList<ItemCategoryRepositoryModel>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final ItemCategoryRepositoryModel _item;
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            _item = new ItemCategoryRepositoryModel(_tmpId,_tmpName);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
