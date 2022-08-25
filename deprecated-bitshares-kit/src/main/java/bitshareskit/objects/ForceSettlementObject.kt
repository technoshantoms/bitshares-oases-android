package bitshareskit.objects

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Ignore
import org.java_json.JSONObject

@Entity(tableName = ForceSettlementObject.TABLE_NAME)
class ForceSettlementObject(@ColumnInfo(name = "data") val rawJson: JSONObject) : GrapheneObject(rawJson) {

    companion object {
        @Ignore const val TABLE_NAME = "force_settlement_object"
//        @Ignore
//        const val KEY = ""
    }

    init {

    }


    override fun equals(other: Any?): Boolean = super.equals(other)
    override fun hashCode(): Int = super.hashCode()

}
