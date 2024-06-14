package org.example.org.example.domains

import jakarta.persistence.*

/**
 * 偏好设置
 */
@Entity
@Table(name = "hi_preference")
class HiPreference {
    @Id
    var id: Long? = null
    @Column(name = "namespace", length = 200)
    var namespace: String? = null

    /**
     * 键
     */
    @Column(name = "`key`", length = 200)
    var key: String? = null

    @Lob
    @Column(name = "value")
    var value: String? = null

    /**
     * 描述
     */
    @Column(name = "`desc`")
    var desc: String? = null

}
