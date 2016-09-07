package org.kotlin99

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.junit.Test

fun <T> rotate(n: Int, list: List<T>): List<T> =
    if (n == 0) list
    else if (n > 0) list.drop(n) + list.take(n)
    else list.takeLast(-n) + list.dropLast(-n)

class P19Test {
    @Test fun `rotate a list N places to the left`() {
        assertThat(rotate(3, "abcdefghijk".toList()), equalTo("defghijkabc".toList()))
        assertThat(rotate(-2, "abcdefghijk".toList()), equalTo("jkabcdefghi".toList()))
    }
}
