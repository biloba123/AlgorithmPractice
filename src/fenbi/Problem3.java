//package fenbi;
//
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;
//
///**
// * 一句话功能描述
// * 功能详细描述
// *
// * @author Lv Qingyang
// * @date 2018/3/15
// * @email biloba12345@gamil.com
// * @github https://github.com/biloba123
// * @blog https://biloba123.github.io/
// * @see
// * @since
// */
//class Problem3 {
//    public TreeNode getFileTree(){
//        List<FileBean> files=Db.query("select * from FileBean");
//        TreeNode root=getRootFile(files);
//
//        if (root != null) {
//            getTree(files, root);
//            return root;
//        }
//
//        return null;
//    }
//
//    private void getTree(List<FileBean> files, TreeNode node) {
//        if(node.mFileBean.type!=1){
//            return;
//        }
//
//        for(Iterator<FileBean> iterator=files.iterator(); iterator.hasNext(); ){
//            FileBean file=iterator.next();
//            if (file.parentId==node.mFileBean.id) {
//                TreeNode child=new TreeNode(file, new ArrayList<>());
//                node.childs.add(child);
//                iterator.remove();//safe remove
//                getTree(files, child);
//            }
//        }
//    }
//
//    private TreeNode getRootFile(List<FileBean> files) {
//        for (FileBean file : files) {
//            if (file.parentId=="0") {
//                return new TreeNode(file, new ArrayList<TreeNode>());
//            }
//        }
//        return null;
//    }
//}
//
//class TreeNode{
//    FileBean mFileBean;
//    List<TreeNode> childs;
//
//    public TreeNode(FileBean fileBean) {
//        mFileBean = fileBean;
//    }
//
//    public TreeNode(FileBean fileBean, List<TreeNode> childs) {
//        mFileBean = fileBean;
//        this.childs = childs;
//    }
//}
//
//class FileBean {
//    public String id;
//    public String name;
//    public int type;
//    public String parentId;
//}