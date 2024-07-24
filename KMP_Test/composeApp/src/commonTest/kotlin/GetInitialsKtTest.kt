import assertk.assertThat
import assertk.assertions.isEqualTo
import kotlin.test.Test

class GetInitialsKtTest {
    @Test
    fun testGetInitials() {
        val fullName = "DongUn KIM"

        assertThat(getInitials(fullName)).isEqualTo("DK")
    }
}