package cn.study.uistudy;

import java.util.List;

public class test {

    private DataDTO data;
    private int errorCode;
    private String errorMsg;

    public DataDTO getData() {
        return data;
    }

    public void setData(DataDTO data) {
        this.data = data;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public static class DataDTO {
        private int curPage;
        private List<DatasDTO> datas;
        private int offset;
        private boolean over;
        private int pageCount;
        private int size;
        private int total;

        public int getCurPage() {
            return curPage;
        }

        public void setCurPage(int curPage) {
            this.curPage = curPage;
        }

        public List<DatasDTO> getDatas() {
            return datas;
        }

        public void setDatas(List<DatasDTO> datas) {
            this.datas = datas;
        }

        public int getOffset() {
            return offset;
        }

        public void setOffset(int offset) {
            this.offset = offset;
        }

        public boolean isOver() {
            return over;
        }

        public void setOver(boolean over) {
            this.over = over;
        }

        public int getPageCount() {
            return pageCount;
        }

        public void setPageCount(int pageCount) {
            this.pageCount = pageCount;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public static class DatasDTO {
            private int anonymous;
            private int appendForContent;
            private int articleId;
            private boolean canEdit;
            private String content;
            private String contentMd;
            private int id;
            private String niceDate;
            private long publishDate;
            private int replyCommentId;
            private List<ReplyCommentsDTO> replyComments;
            private int rootCommentId;
            private int status;
            private int toUserId;
            private String toUserName;
            private int userId;
            private String userName;
            private int zan;

            public int getAnonymous() {
                return anonymous;
            }

            public void setAnonymous(int anonymous) {
                this.anonymous = anonymous;
            }

            public int getAppendForContent() {
                return appendForContent;
            }

            public void setAppendForContent(int appendForContent) {
                this.appendForContent = appendForContent;
            }

            public int getArticleId() {
                return articleId;
            }

            public void setArticleId(int articleId) {
                this.articleId = articleId;
            }

            public boolean isCanEdit() {
                return canEdit;
            }

            public void setCanEdit(boolean canEdit) {
                this.canEdit = canEdit;
            }

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public String getContentMd() {
                return contentMd;
            }

            public void setContentMd(String contentMd) {
                this.contentMd = contentMd;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getNiceDate() {
                return niceDate;
            }

            public void setNiceDate(String niceDate) {
                this.niceDate = niceDate;
            }

            public long getPublishDate() {
                return publishDate;
            }

            public void setPublishDate(long publishDate) {
                this.publishDate = publishDate;
            }

            public int getReplyCommentId() {
                return replyCommentId;
            }

            public void setReplyCommentId(int replyCommentId) {
                this.replyCommentId = replyCommentId;
            }

            public List<ReplyCommentsDTO> getReplyComments() {
                return replyComments;
            }

            public void setReplyComments(List<ReplyCommentsDTO> replyComments) {
                this.replyComments = replyComments;
            }

            public int getRootCommentId() {
                return rootCommentId;
            }

            public void setRootCommentId(int rootCommentId) {
                this.rootCommentId = rootCommentId;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public int getToUserId() {
                return toUserId;
            }

            public void setToUserId(int toUserId) {
                this.toUserId = toUserId;
            }

            public String getToUserName() {
                return toUserName;
            }

            public void setToUserName(String toUserName) {
                this.toUserName = toUserName;
            }

            public int getUserId() {
                return userId;
            }

            public void setUserId(int userId) {
                this.userId = userId;
            }

            public String getUserName() {
                return userName;
            }

            public void setUserName(String userName) {
                this.userName = userName;
            }

            public int getZan() {
                return zan;
            }

            public void setZan(int zan) {
                this.zan = zan;
            }

            public static class ReplyCommentsDTO {
                private int anonymous;
                private int appendForContent;
                private int articleId;
                private boolean canEdit;
                private String content;
                private String contentMd;
                private int id;
                private String niceDate;
                private long publishDate;
                private int replyCommentId;
                private List<?> replyComments;
                private int rootCommentId;
                private int status;
                private int toUserId;
                private String toUserName;
                private int userId;
                private String userName;
                private int zan;

                public int getAnonymous() {
                    return anonymous;
                }

                public void setAnonymous(int anonymous) {
                    this.anonymous = anonymous;
                }

                public int getAppendForContent() {
                    return appendForContent;
                }

                public void setAppendForContent(int appendForContent) {
                    this.appendForContent = appendForContent;
                }

                public int getArticleId() {
                    return articleId;
                }

                public void setArticleId(int articleId) {
                    this.articleId = articleId;
                }

                public boolean isCanEdit() {
                    return canEdit;
                }

                public void setCanEdit(boolean canEdit) {
                    this.canEdit = canEdit;
                }

                public String getContent() {
                    return content;
                }

                public void setContent(String content) {
                    this.content = content;
                }

                public String getContentMd() {
                    return contentMd;
                }

                public void setContentMd(String contentMd) {
                    this.contentMd = contentMd;
                }

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getNiceDate() {
                    return niceDate;
                }

                public void setNiceDate(String niceDate) {
                    this.niceDate = niceDate;
                }

                public long getPublishDate() {
                    return publishDate;
                }

                public void setPublishDate(long publishDate) {
                    this.publishDate = publishDate;
                }

                public int getReplyCommentId() {
                    return replyCommentId;
                }

                public void setReplyCommentId(int replyCommentId) {
                    this.replyCommentId = replyCommentId;
                }

                public List<?> getReplyComments() {
                    return replyComments;
                }

                public void setReplyComments(List<?> replyComments) {
                    this.replyComments = replyComments;
                }

                public int getRootCommentId() {
                    return rootCommentId;
                }

                public void setRootCommentId(int rootCommentId) {
                    this.rootCommentId = rootCommentId;
                }

                public int getStatus() {
                    return status;
                }

                public void setStatus(int status) {
                    this.status = status;
                }

                public int getToUserId() {
                    return toUserId;
                }

                public void setToUserId(int toUserId) {
                    this.toUserId = toUserId;
                }

                public String getToUserName() {
                    return toUserName;
                }

                public void setToUserName(String toUserName) {
                    this.toUserName = toUserName;
                }

                public int getUserId() {
                    return userId;
                }

                public void setUserId(int userId) {
                    this.userId = userId;
                }

                public String getUserName() {
                    return userName;
                }

                public void setUserName(String userName) {
                    this.userName = userName;
                }

                public int getZan() {
                    return zan;
                }

                public void setZan(int zan) {
                    this.zan = zan;
                }
            }
        }
    }
}
