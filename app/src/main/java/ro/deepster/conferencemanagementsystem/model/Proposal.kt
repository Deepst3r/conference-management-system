package ro.deepster.conferencemanagementsystem.model

data class Proposal(
    val title: String = "",
    val abstract: String = "",
    val topics: String = "",
    val keywords: String = "",
    val author: String = "",
    val paperLink: String = "",
    val bidders: MutableList<String> = mutableListOf()
) {
    fun addBidder(bidder: String) {
        bidders.add(bidder)
    }
}