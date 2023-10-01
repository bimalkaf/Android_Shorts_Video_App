package np.com.bimalkafle.miniclip.model

data class UserModel(
    var id : String = "",
    var email : String ="",
    var username : String ="",
    var profilePic : String = "",
    var followerList : MutableList<String> = mutableListOf(),
    var followingList : MutableList<String> = mutableListOf()
)
