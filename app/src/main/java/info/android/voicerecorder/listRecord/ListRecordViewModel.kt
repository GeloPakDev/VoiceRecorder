package info.android.voicerecorder.listRecord

import androidx.lifecycle.ViewModel
import info.android.voicerecorder.database.RecordDatabaseDao

class ListRecordViewModel (
    dataSource: RecordDatabaseDao
) : ViewModel() {

    val database = dataSource
    val records = database.getAllRecords()
}