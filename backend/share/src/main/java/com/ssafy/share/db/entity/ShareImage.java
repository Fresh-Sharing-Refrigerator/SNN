package com.ssafy.share.db.entity;

import lombok.*;
import org.yaml.snakeyaml.events.Event;

import javax.persistence.*;

import static javax.persistence.FetchType.LAZY;
@Entity
@Getter @Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ShareImage {
    @Id
    @Column(name = "share_post_img_url",length = 255)
    private String sharePostImageUrl; // 글 이미지 url

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name="share_post_id")
    private SharePost sharePost; // 글 번호

    @Builder
    public ShareImage(SharePost sharePost,String sharePostImageUrl) {
        this.sharePost = sharePost;
        this.sharePostImageUrl = sharePostImageUrl;
    }
}
